package mvc.cloud_provider_domain;

import mvc.cloud_provider_domain.factory.CloudFactory;
import mvc.cloud_provider_domain.product.compute.ComputeService;
import mvc.cloud_provider_domain.product.network.NetworkService;
import mvc.cloud_provider_domain.product.storage.StorageService;

public class CloudFactoryProducer {
    private final ComputeService computeService;
    private final StorageService storageService;
    private final NetworkService networkService;

    public CloudFactoryProducer(CloudFactory cloudFactory){
        computeService = cloudFactory.createComputeService();
        storageService = cloudFactory.createStorageService();
        networkService = cloudFactory.createNetworkService();
    }
    public void bootstrap(){
        computeService.deploy();
        storageService.store();
        networkService.configure();
    }
}
