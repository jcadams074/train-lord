package com.bi.util;

import com.bi.constants.CityConstants;
import com.bi.util.charts.payoff_charts.AlbanyChart;
import com.bi.util.charts.payoff_charts.AtlantaChart;
import com.bi.util.charts.payoff_charts.BaltimoreChart;
import com.bi.util.charts.payoff_charts.BillingsChart;
import com.bi.util.charts.payoff_charts.BirminghamChart;
import com.bi.util.charts.payoff_charts.BostonChart;
import com.bi.util.charts.payoff_charts.BuffaloChart;
import com.bi.util.charts.payoff_charts.ButteChart;
import com.bi.util.charts.payoff_charts.CasperChart;
import com.bi.util.charts.payoff_charts.CharlestonChart;
import com.bi.util.charts.payoff_charts.CharlotteChart;
import com.bi.util.charts.payoff_charts.ChattanoogaChart;
import com.bi.util.charts.payoff_charts.ChicagoChart;
import com.bi.util.charts.payoff_charts.CincinnatiChart;
import com.bi.util.charts.payoff_charts.ClevelandChart;
import com.bi.util.charts.payoff_charts.ColumbusChart;
import com.bi.util.charts.payoff_charts.DallasChart;
import com.bi.util.charts.payoff_charts.DenverChart;
import com.bi.util.charts.payoff_charts.DesMoinesChart;
import com.bi.util.charts.payoff_charts.DetroitChart;
import com.bi.util.charts.payoff_charts.ElPasoChart;

public class ChartSelectorUtil {
    
    public static double getPayoffMultiplier(String originCityName, String destinationCityName){

        double payoff = 0.0;
        //TODO: update these to use correct chart
        switch (originCityName) {
            case CityConstants.ALBANY:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.ATLANTA:
                payoff = AtlantaChart.map.get(destinationCityName);
                break;
            case CityConstants.BALTIMORE:
                payoff = BaltimoreChart.map.get(destinationCityName);
                break;
            case CityConstants.BILLINGS:
                payoff = BillingsChart.map.get(destinationCityName);
                break;
            case CityConstants.BIRMINGHAM:
                payoff = BirminghamChart.map.get(destinationCityName);
                break;
            case CityConstants.BOSTON:
                payoff = BostonChart.map.get(destinationCityName);
                break;
            case CityConstants.BUFFALO:
                payoff = BuffaloChart.map.get(destinationCityName);
                break;
            case CityConstants.BUTTE:
                payoff = ButteChart.map.get(destinationCityName);
                break;
            case CityConstants.CASPER:
                payoff = CasperChart.map.get(destinationCityName);
                break;
            case CityConstants.CHARLESTON:
                payoff = CharlestonChart.map.get(destinationCityName);
                break;
            case CityConstants.CHARLOTTE:
                payoff = CharlotteChart.map.get(destinationCityName);
                break;
            case CityConstants.CHATTENOOGA:
                payoff = ChattanoogaChart.map.get(destinationCityName);
                break;
            case CityConstants.CHICAGO:
                payoff = ChicagoChart.map.get(destinationCityName);
                break;
            case CityConstants.CINCINNATI:
                payoff = CincinnatiChart.map.get(destinationCityName);
                break;
            case CityConstants.CLEVELAND:
                payoff = ClevelandChart.map.get(destinationCityName);
                break;
            case CityConstants.COLUMBUS:
                payoff = ColumbusChart.map.get(destinationCityName);
                break;
            case CityConstants.DALLAS:
                payoff = DallasChart.map.get(destinationCityName);
                break;
            case CityConstants.DENVER:
                payoff = DenverChart.map.get(destinationCityName);
                break;
            case CityConstants.DES_MOINES:
                payoff = DesMoinesChart.map.get(destinationCityName);
                break;
            case CityConstants.DETROIT:
                payoff = DetroitChart.map.get(destinationCityName);
                break;
            case CityConstants.EL_PASO:
                payoff = ElPasoChart.map.get(destinationCityName);
                break;
            case CityConstants.FARGO:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.FORT_WORTH:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.HOUSTON:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.INDIANAPOLIS:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.JACKSONVILLE:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.KANSAS_CITY:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.KNOXVILLE:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.LAS_VEGAS:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.LITTLE_ROCK:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.LOS_ANGELES:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.LOUISVILLE:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.MEMPHIS:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.MIAMI:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.MILWAUKEE:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.MINNEAPOLIS_ST_PAUL:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.MOBILE:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.NASHVILLE:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.NEW_ORLEANS:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.NEW_YORK:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.NORFOLK:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.OKLAHOMA_CITY:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.OMAHA:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.PHILADELPHIA:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.PHOENIX:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.PITTSBURGH:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.POCATELLO:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.PORTLAND_ME:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.PORTLAND_OR:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.PUEBLO:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.RAPID_CITY:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.RENO:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.RICHMOND:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.SACRAMENTO:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.SALT_LAKE_CITY:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.SAN_ANTONIO:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.SAN_DIEGO:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.SAN_FRANCISCO_OAKLAND:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.SEATTLE:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.SHREVEPORT:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.SPOKANE:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.ST_LOUIS:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.TAMPA:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.TUCUMCARI:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
            case CityConstants.WASHINGTON_DC:
                payoff = AlbanyChart.map.get(destinationCityName);
                break;
        }

        return payoff;
    }
}
