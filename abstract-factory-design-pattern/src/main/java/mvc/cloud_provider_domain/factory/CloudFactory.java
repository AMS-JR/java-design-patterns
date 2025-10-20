package mvc.cloud_provider_domain.factory;

import mvc.cloud_provider_domain.product.compute.ComputeService;
import mvc.cloud_provider_domain.product.network.NetworkService;
import mvc.cloud_provider_domain.product.storage.StorageService;

public interface CloudFactory {
     ComputeService createComputeService();
     StorageService createStorageService();
     NetworkService createNetworkService();
}

