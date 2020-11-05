package hu.zsigmondpeter.gameoflife.service;

public class MainRestResponse
{
    private final String[] listOfApis;

    public MainRestResponse(String[] listOfApis)
    {
        this.listOfApis = listOfApis;
    }

    public String[] getListOfApis()
    {
        return this.listOfApis;
    }
}
