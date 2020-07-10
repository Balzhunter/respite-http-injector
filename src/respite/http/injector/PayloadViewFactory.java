/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respite.http.injector;

import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

/**
 *
 * @author user
 */
public class PayloadViewFactory extends Object implements ViewFactory {

    /**
     * @see javax.swing.text.ViewFactory#create(javax.swing.text.Element)
     */
    public View create(Element element) {

        return new PayloadView(element);
    }

}
