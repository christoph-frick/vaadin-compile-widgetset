package app

import com.vaadin.grails.Grails
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import org.vaadin.openesignforms.ckeditor.CKEditorTextField
import org.vaadin.tokenfield.TokenField

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
		setContent(new VerticalLayout().with{
            addComponent(new TokenField().with{
                caption = Grails.i18n("Tags")
                required = true
                containerDataSource.addItem("Vaadin")
                containerDataSource.addItem("Grails")
                return it
            })
            addComponent(new CKEditorTextField().with{
                caption = Grails.i18n("Text")
                return it
            })
            return it
        })
    }
}
