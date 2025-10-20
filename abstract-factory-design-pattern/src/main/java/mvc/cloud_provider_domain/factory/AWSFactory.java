package mvc.cloud_provider_domain.factory;

import mvc.cloud_provider_domain.product.compute.ComputeService;
import mvc.cloud_provider_domain.product.compute.EC2;
import mvc.cloud_provider_domain.product.network.NetworkService;
import mvc.cloud_provider_domain.product.network.VPC;
import mvc.cloud_provider_domain.product.storage.S3;
import mvc.cloud_provider_domain.product.storage.StorageService;

public class AWSFactory implements CloudFactory{
    @Override
    public ComputeService createComputeService() {
        return new EC2();
    }

    @Override
    public StorageService createStorageService() {
        return new S3();
    }

    @Override
    public NetworkService createNetworkService() {
        return new VPC();
    }
}
