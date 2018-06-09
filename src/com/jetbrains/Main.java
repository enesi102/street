package com.jetbrains;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import static com.jetbrains.WorkWithFiles.getStreetNamesFromFile;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        files
         final String INPUTFILE = "sreet-names.txt";
         final String OUTPUTFILE = "possible-street-types.txt";



//        get list from file
            List<String> streetNames = WorkWithFiles.getStreetNamesFromFile(INPUTFILE);

//        extract possible street types(.name/.frequency) from list
            Set<StreetType> streetTypes = StreetTypeExtractor.extractStreetType(streetNames);

//        export possible street types with freFquency to file
            WorkWithFiles.exportStreetTypesToFile(streetTypes, OUTPUTFILE);


    }
}