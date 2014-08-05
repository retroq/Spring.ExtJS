package mycon;

import java.util.List;

/**
 * Date: 04.08.14
 *
 * @author sipachev_ai
 */
public class POJOBean {
    private String beanName;
    private List<Long> ids;
    private NestedPOJOBean nestedPOJOBean;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public NestedPOJOBean getNestedPOJOBean() {
        return nestedPOJOBean;
    }

    public void setNestedPOJOBean(NestedPOJOBean nestedPOJOBean) {
        this.nestedPOJOBean = nestedPOJOBean;
    }
}
