package it.polimi.elet.selflet.utilities;

/**
 * Representes an item with a weigh
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public interface IWeightedItem {

	double MIN_WEIGHT = 0.01;

	double weight();
}
