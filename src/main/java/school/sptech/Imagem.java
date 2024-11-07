package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {


   private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura){

        figuras.add(figura);


    }
    public Double calcularSomaDasAreas(){

        Double total = 0.0;
        for (Figura figura :figuras) {
         total += figura.calcularArea();
        }
return total;
    }
    public List<Figura> buscarPorAreaMaiorQue20(){

 List<Figura> buscarMaiorQue20 = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20){
               buscarMaiorQue20.add(figura);
            }

        }

        return buscarMaiorQue20;
    }
    public List<Figura> buscarQuadrados(){

        List<Figura> buscarQuadrado = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado){
                buscarQuadrado.add(figura);
            }

        }
            return buscarQuadrado;
    }
}
