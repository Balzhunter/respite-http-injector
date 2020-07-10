/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respite.http.injector;

import javax.swing.JTextPane;

/**
 *
 * @author user
 */
public class PayloadTextPane extends JTextPane {

    private static final long serialVersionUID = 6270183148379328084L;

    public PayloadTextPane() {

        // Set editor kit
        this.setEditorKitForContentType("text/xml", new PayloadEditorKit());
        this.setContentType("text/xml");
    }

}
