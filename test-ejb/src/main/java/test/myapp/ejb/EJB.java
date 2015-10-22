package test.myapp.ejb;

import tst.myapp.core.IEJB;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author andre
 * @since 21/10/2015 23:27
 */
@Stateless
@Remote(IEJB.class)
public class EJB implements IEJB {

    @Override
    public Integer calc(Integer a){
        return a + 10;
    }

}
