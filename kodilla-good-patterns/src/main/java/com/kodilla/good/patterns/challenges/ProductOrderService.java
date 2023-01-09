package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private SellServices sellServices;
    private SellRepository sellRepository;

public ProductOrderService (final InformationService informationService,
            final SellServices sellServices,
            final SellRepository sellRepository ){
    this.informationService = informationService;
    this.sellServices = sellServices;
    this.sellRepository = sellRepository;
}
public void process(OrderRequest orderRequest){
    sellServices.sellProcess(orderRequest.getBuyer(), orderRequest.getProduct());
    informationService.inform(orderRequest.getBuyer());
    sellRepository.saveData(orderRequest.getProduct(), orderRequest.getBuyer());
}
}
