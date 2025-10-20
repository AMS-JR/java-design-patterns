package mvc.cloud_provider_domain.factory;

import mvc.cloud_provider_domain.product.compute.ComputeEngine;
import mvc.cloud_provider_domain.product.compute.ComputeService;
import mvc.cloud_provider_domain.product.network.NetworkService;
import mvc.cloud_provider_domain.product.network.VPCNetwork;
import mvc.cloud_provider_domain.product.storage.CloudStorage;
import mvc.cloud_provider_domain.product.storage.StorageService;

public class GCPFactory implements CloudFactory{
    @Override
    public ComputeService createComputeService() {
        return new ComputeEngine();
    }

    @Override
    public StorageService createStorageService() {
        return new CloudStorage();
    }

    @Override
    public NetworkService createNetworkService() {
        return new VPCNetwork();
    }
}
