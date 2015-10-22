package tst.myapp.core;

import javax.ejb.Remote;

/**
 * @author andre
 * @since 21/10/2015 23:25
 */
@Remote
public interface IEJB {

    Integer calc(Integer a);
}
