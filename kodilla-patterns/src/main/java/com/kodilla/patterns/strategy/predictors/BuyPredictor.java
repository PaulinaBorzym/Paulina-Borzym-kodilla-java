package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import com.kodilla.patterns.strategy.predictors.BalancedPredictor;
import com.kodilla.patterns.strategy.predictors.ConservativePredictor;

public interface BuyPredictor
       // permits AggressivePredictor, BalancedPredictor, ConservativePredictor { //TODO seald i permits
{
    String predictWhatToBuy();
}
