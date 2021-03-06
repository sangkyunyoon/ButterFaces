package org.butterfaces.component.html.text.part;

import org.butterfaces.component.base.component.UIComponentBase;
import org.butterfaces.model.text.AutoCompleteModel;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.FacesComponent;
import java.util.ArrayList;
import java.util.List;

@ResourceDependencies({
        @ResourceDependency(library = "butterfaces-dist-css", name = "butterfaces-autocomplete.css", target = "head"),
        @ResourceDependency(library = "butterfaces-dist-css", name = "butterfaces-dropdownlist.css", target = "head"),
        @ResourceDependency(library = "butterfaces-dist-css", name = "dist-butterfaces-bootstrap.css", target = "head"),
        @ResourceDependency(library = "butterfaces-dist-bundle-dev-js", name = "butterfaces-third-party-jquery.js", target = "head"),
        @ResourceDependency(library = "butterfaces-js", name = "butterfaces-01-baseClass.js", target = "head"),
        @ResourceDependency(library = "butterfaces-js", name = "butterfaces-autocomplete.jquery.js", target = "head"),
        @ResourceDependency(library = "butterfaces-js", name = "butterfaces-highlight.jquery.js", target = "head"),
        @ResourceDependency(library = "javax.faces", name = "jsf.js", target = "head")
})
@FacesComponent(HtmlAutoComplete.COMPONENT_TYPE)
public class HtmlAutoComplete extends UIComponentBase {

    public static final String COMPONENT_TYPE = "org.butterfaces.component.autoComplete";
    public static final String COMPONENT_FAMILY = "org.butterfaces.component.family";
    public static final String RENDERER_TYPE = "org.butterfaces.renderkit.html_basic.AutoCompleteRenderer";

    protected static final String PROPERTY_AUTO_COMPLETE = "autoComplete";

    private final List<String> cachedAutoCompleteValues = new ArrayList<>();

    public HtmlAutoComplete() {
        super();
        this.setRendererType(RENDERER_TYPE);
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public AutoCompleteModel getAutoComplete() {
        return (AutoCompleteModel) this.getStateHelper().eval(PROPERTY_AUTO_COMPLETE);
    }

    public void setAutoComplete(AutoCompleteModel autoComplete) {
        this.updateStateHelper(PROPERTY_AUTO_COMPLETE, autoComplete);
    }

    public List<String> getCachedAutoCompleteValues() {
        return cachedAutoCompleteValues;
    }
}
