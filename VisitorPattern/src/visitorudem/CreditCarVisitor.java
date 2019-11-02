/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorudem;

/**
 *
 * @author David
 */
public interface CreditCarVisitor {
    void ofertaGasolina(OfertaGasolina ofertaGasolina);
    void ofertaVuelos(OfertaVuelos ofertaVuelos);
    void ofertaParqueadero(OfertaParqueadero ofertaParqueader);
    void ofertaRestaurante(OfertaRestaurante ofertaRestaurante);
    void ofertaRopa(OfertaRopa ofertaRopa);
}
