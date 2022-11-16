package solidLab.p04_InterfaceSegregation.p02_identity.interfaces;

public interface AccountControllerInterface {
    boolean getRequireUniqueEmail();

    int getMinRequiredPasswordLength();

    int getMaxRequiredPasswordLength();
}
