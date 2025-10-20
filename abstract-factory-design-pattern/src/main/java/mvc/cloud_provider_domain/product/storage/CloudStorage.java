package mvc.cloud_provider_domain.product.storage;

public class CloudStorage implements StorageService{
    @Override
    public void store() {
        System.out.println("Store on CloudStorage!");
    }
}