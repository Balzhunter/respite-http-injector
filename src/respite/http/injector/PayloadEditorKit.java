/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respite.http.injector;

import javax.swing.text.StyledEditorKit;
import javax.swing.text.ViewFactory;

/**
 *
 * @author user
 */
public class PayloadEditorKit extends StyledEditorKit {

    private static final long serialVersionUID = 2969169649596107757L;
    private ViewFactory payloadViewFactory;

    public PayloadEditorKit() {
        payloadViewFactory = new PayloadViewFactory();
    }

    @Override
    public ViewFactory getViewFactory() {
        return payloadViewFactory;
    }

    @Override
    public String getContentType() {
        return "text/xml";
    }
}