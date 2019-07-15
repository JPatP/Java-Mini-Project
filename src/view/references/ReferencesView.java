/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.references;

import controller.references.ReferencesController;

/**
 *
 * @author Evil Genius
 */
public class ReferencesView {

    public static void main(String[] args) {
        ReferencesController referencesController = new ReferencesController();
        // action references
        referencesController.setReferenceData();
        referencesController.printReference();

    }

}
