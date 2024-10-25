public interface IBosRepo<E extends IEntity > {
    void ekle(E entity);
    void kaldir(E entity);
    void guncelle(E entity);
}
