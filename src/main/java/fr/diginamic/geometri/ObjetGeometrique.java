package fr.diginamic.geometri;

/** Liste les méthodes obligatoires que doit posséder un objet géométrique
 * @author Sionra
 */
public interface ObjetGeometrique {
    /** Retourne le périmètre d’une forme géométrique
     * @return double
     */
    double perimetre();
    /** Retourne la surface
     * @return double
     */
    double surface();
}