/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Asus
 */
public class ModalPizza extends ResepPizza {
    public void modalAdonan (){
        return (adonanTepungTerigu * hargaPerGram.gramTepungTerigu) + (adonanGulaPasir * hargaPerGram.gramGulaPasir) + (adonanButter * hargaPerGram.gramButter) + (adonanRagi * hargaPerGram.gramRagi) + (adonanSusuBubuk * hargaPerGram.gramSusuBubuk) + (adonanSusuCair * hargaPerGram.gramSusuCair) + (adonanTelur * hargaPerGram.gramTelur) + (adonanEsBatu * hargaPerGram.gramEsBatu);
    }
}
