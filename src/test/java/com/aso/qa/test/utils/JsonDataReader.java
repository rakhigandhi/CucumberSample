package com.aso.qa.test.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.aso.qa.test.managers.FileReaderManager;
import com.aso.qa.test.testDataType.SKU;
import com.google.gson.Gson;

public class JsonDataReader {

	private final String skuFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "/sku.json";
	private List<SKU> skuList;
	
	public JsonDataReader(){
        skuList = getSkuData();
    }
	
	private List<SKU> getSkuData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(skuFilePath));
            SKU[] skus = gson.fromJson(bufferReader, SKU[].class);
            return Arrays.asList(skus);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + skuFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }
	
	public final SKU getSkuById(String id){
        for(SKU sku : skuList) {
            if(sku.id.equalsIgnoreCase(id)) return sku;
        }
        return null;
    }
	
}
