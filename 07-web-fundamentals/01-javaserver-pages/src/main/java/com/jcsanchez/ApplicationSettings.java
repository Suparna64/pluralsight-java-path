package com.jcsanchez;

import java.util.List;

/**
 * Created by jsssn on 10-May-17.
 */
public class ApplicationSettings {

    private CssClass _formCssClass;
    private List<Tab> _tabs;

    public CssClass getFormCssClass() { return _formCssClass; }
    public void setFormCssClass(CssClass value) { _formCssClass = value; }

    private String[] _tabNames;
    public String[] getTabNames() {
        return _tabNames;
    }
    public void setTabNames(String[] names) {
        _tabNames = new String[names.length];
        System.arraycopy(names, 0, _tabNames, 0, names.length);
    }

    public void setTabs(List<Tab> tabs) {
        this._tabs = tabs;
    }

    public List<Tab> getTabs() {
        return _tabs;
    }
}
