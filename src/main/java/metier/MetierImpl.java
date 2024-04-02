package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    // couplage faible
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
/* Injecter dans l'interface dao un object d'une classe qui implemente l'interface IDao */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
