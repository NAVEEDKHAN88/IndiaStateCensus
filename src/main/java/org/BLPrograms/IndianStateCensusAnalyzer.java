package org.BLPrograms;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IndianStateCensusAnalyzer {
    private static final String FILE_PATH = "E:\\BridgeLabzAssignments\\StateCensus\\src\\main\\resources";
    private static final String INDIAN_STATE_CENCES = "/IndiaStateCensusData.csv";
    private static final String FILE_PATH1 = "E:\\BridgeLabzAssignments\\StateCensus\\src\\main\\resources";
    private static final String INDIAN_STATE_CENCES_CODE = "/IndiaStateCode.csv";

    public List<StateCences> readInIndiaStateCensusData(String fileName)
    {
        try
        {
            Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH+INDIAN_STATE_CENCES));
            CsvToBean<StateCences> csvToBean = new CsvToBeanBuilder<StateCences>(reader)
                    .withType(StateCences.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            return csvToBean.parse();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public List<StateCences> readInIndiaStateCode(String fileName)
    {
        try
        {
            Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH1+INDIAN_STATE_CENCES_CODE));
            CsvToBean<StateCences> csvToBean = new CsvToBeanBuilder<StateCences>(reader)
                    .withType(StateCences.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            return csvToBean.parse();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
