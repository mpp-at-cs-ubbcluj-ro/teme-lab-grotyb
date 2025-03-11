package ro.mpp2025;

public interface Identifiable<ID> {
    void setId(ID id);
    ID getId();
}
