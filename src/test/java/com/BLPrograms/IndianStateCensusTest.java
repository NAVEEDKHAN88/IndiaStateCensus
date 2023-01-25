package com.BLPrograms;

import org.BLPrograms.CustomExceptionService;
import org.BLPrograms.IndianStateCensusAnalyzer;
import org.BLPrograms.StateCences;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IndianStateCensusTest {
    // Test cases for UC1 for Indian State Census Data
    @Test
    public void givenReadDataFromIndianCensus_ShouldReturnCountDataPresentInFile()
    {
        String fileName = "/IndiaStateCensusData.csv";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        List<StateCences> stateCencesList = censusService.readInIndiaStateCensusData(fileName);
        Assertions.assertEquals(29, stateCencesList.size());
    }

    @Test
    public void givenWrongFile_ShouldReturnFileNotFound()
    {
        String fileName = "/IndiaStateCensusData.csv";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        try
        {
            List<StateCences> stateCencesList = censusService.readInIndiaStateCensusData(fileName);
            Assertions.assertEquals(29, stateCencesList.size());
        }
        catch (CustomExceptionService e)
        {
            Assertions.assertEquals(CustomExceptionService.ExceptionType.FILE_NOT_FOUND, e.type);
        }
    }

    @Test
    public void givenWrongFileExtention_ShouldReturnWrongFileType()
    {
        String fileName = "/IndiaStateCensusData.txt";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        try
        {
            List<StateCences> stateCencesList = censusService.readInIndiaStateCensusData(fileName);
            Assertions.assertEquals(29, stateCencesList.size());
        }
        catch (CustomExceptionService e)
        {
            Assertions.assertEquals(CustomExceptionService.ExceptionType.WRONG_FILE_TYPE, e.type);
        }
    }

    @Test
    public void givenWrongFileHeaders_ShouldReturnWrongHeader()
    {
        String fileName = "/IndiaStateCensusData.csv";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        try
        {
            List<StateCences> stateCencesList = censusService.readInIndiaStateCensusData(fileName);
            Assertions.assertEquals(29, stateCencesList.size());
        }
        catch (CustomExceptionService e)
        {
            Assertions.assertEquals(CustomExceptionService.ExceptionType.WRONG_HEADER, e.type);
        }
    }


    // UC2 for Indian State Code
    @Test
    public void givenReadDataFromIndianCensus_ShouldReturnCountCodePresentInFile()
    {
        String fileName = "/IndiaStateCode.csv";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        List<StateCences> stateCencesList = censusService.readInIndiaStateCode(fileName);
        Assertions.assertEquals(37, stateCencesList.size());
    }

    @Test
    public void givenWrongFile_ShouldReturnCodeFileNotFound()
    {
        String fileName = "/IndiaStateCode.csv";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        try
        {
            List<StateCences> stateCencesList = censusService.readInIndiaStateCode(fileName);
            Assertions.assertEquals(37, stateCencesList.size());
        }
        catch (CustomExceptionService e)
        {
            Assertions.assertEquals(CustomExceptionService.ExceptionType.FILE_NOT_FOUND, e.type);
        }
    }

    @Test
    public void givenWrongFileExtention_ShouldReturnWrongCodeFileType()
    {
        String fileName = "/IndiaStateCode.txt";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        try
        {
            List<StateCences> stateCencesList = censusService.readInIndiaStateCode(fileName);
            Assertions.assertEquals(37, stateCencesList.size());
        }
        catch (CustomExceptionService e)
        {
            Assertions.assertEquals(CustomExceptionService.ExceptionType.WRONG_FILE_TYPE, e.type);
        }
    }

    @Test
    public void givenWrongCodeFileHeaders_ShouldReturnWrongHeader()
    {
        String fileName = "/IndiaStateCode.csv";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        try
        {
            List<StateCences> stateCencesList = censusService.readInIndiaStateCode(fileName);
            Assertions.assertEquals(37, stateCencesList.size());
        }
        catch (CustomExceptionService e)
        {
            Assertions.assertEquals(CustomExceptionService.ExceptionType.WRONG_HEADER, e.type);
        }
    }
}
