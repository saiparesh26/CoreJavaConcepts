package aggregators;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor <T extends Aggregator>  {
	
	private T aggregator;
	private String file;
	
	public AggregatorProcessor(T aggregator, String file) {
		super();
		this.aggregator = aggregator;
		this.file = file;
	}

	public double runAggregator(int colId) throws IOException {
		StockFileReader fileReader = new StockFileReader(file);
		List<String> lines = fileReader.readFileData();
		colId--;
		for (String line : lines) {
			String[] numbers = line.split(",");
			double value = Double.parseDouble(numbers[colId]);
			aggregator.add(value);
		}
		double number = aggregator.calculate();
		return number;
	}	
	
}
