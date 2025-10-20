package mvc.cloud_provider_domain.product.storage;

public class BlobStorage implements StorageService{
    @Override
    public void store() {
        System.out.println("Store on Azure BlobStorage!");
    }
}
