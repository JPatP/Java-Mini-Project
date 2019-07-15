/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.references;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.references.ActionReference;
import model.references.FlashCards;
import model.references.Magazine;
import model.references.OtherMaterials;
import model.references.ReferencesModel;
import model.references.VideoCD;

/**
 *
 * @author Evil Genius
 */
public class ReferencesController {

    private List<ReferencesModel> reference = new ArrayList<>();

    // set ActionReference Data
    public void setReferenceData() {
        reference.add(new ActionReference(1, "ACTION Reference", "Minna no Nihongo", "AIC Corporation", 150, true, 1000, "Masakito Sauro"));
        reference.add(new FlashCards(2, "FlashCards", "Java OCA", "Sybex", 20, true, 2000));
        reference.add(new Magazine(3, "Magazine", "Health & Fitness", "Summit Media", 50, true, 2500));
        reference.add(new VideoCD(4, "Video/CD", "Pentatonic Scale", "Harmonia", 70, true, 800, 240));
        reference.add(new OtherMaterials(5, "Other Materials", "Pugad Baboy", "Pinoy Komiks", 250, true, 1000, "Pedro Estafa"));
    }

    // print ActionReference 
    public void printReference() {
        for (ReferencesModel references : reference) {
            System.out.println(references.getReferenceNumber()
                    + " " + references.getReferenceType()
                    + " " + references.getTitle()
                    + " " + references.getPublisher()
                    + " " + references.getMaxBorrowDays()
                    + " " + references.getAvailability()
                    + " " + references.getPenaltyFee());
        }

    }

    public void updateRefe() {
        for (int i = 0; i < reference.size(); i++) {
            if (reference.get(i).getReferenceNumber() == 1) {
                reference.get(i).setReferenceNumber(10);
            }
        }
    }
}
