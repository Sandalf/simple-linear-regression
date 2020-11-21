/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ia.slr;

/**
 *
 * @author luissandoval
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You must pass an x value as an argument");
            return;
        }

        double xArg = Double.parseDouble(args[0]);

        // Benetton data set: https://www.displayr.com/what-is-linear-regression/
        // X: Advertising, Y: Sales
        double[][] benettonData = {
            {23, 651},
            {26, 762},
            {30, 856},
            {34, 1063},
            {43, 1190},
            {48, 1298},
            {52, 1421},
            {57, 1440},
            {58, 1518}
        };

        // Inhabited private homes in Mexico: https://www.inegi.org.mx/temas/vivienda/#Informacion_general
        // X: Year, Y: Private homes in millions
        double[][] inegiData = {
            {1990, 16.18},
            {1995, 19.40},
            {2000, 21.94},
            {2005, 24.70},
            {2010, 28.60},
            {2015, 31.94}
        };

        Dataset dataset = new Dataset(inegiData);
        SimpleLinearRegression slr = new SimpleLinearRegression(dataset);
        slr.printEquation();
        slr.predict(xArg);
    }
}
