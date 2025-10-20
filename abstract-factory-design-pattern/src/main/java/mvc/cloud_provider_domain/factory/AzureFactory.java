package mvc.cloud_provider_domain.factory;

import mvc.cloud_provider_domain.product.compute.ComputeService;
import mvc.cloud_provider_domain.product.compute.VirtualMachine;
import mvc.cloud_provider_domain.product.network.NetworkService;
import mvc.cloud_provider_domain.product.network.VirtualNetwork;
import mvc.cloud_provider_domain.product.storage.BlobStorage;
import mvc.cloud_provider_domain.product.storage.StorageService;

public class AzureFactory implements CloudFactory{
    @Override
    public ComputeService createComputeService() {
        return new VirtualMachine();
    }

    @Override
    public StorageService createStorageService() {
        return new BlobStorage();
    }

    @Override
    public NetworkService createNetworkService() {
        return new VirtualNetwork();
    }
}
