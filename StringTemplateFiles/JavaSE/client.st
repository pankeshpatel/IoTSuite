<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script type="text/javascript"
            src="https://www.google.com/jsapi?autoload={
    'modules':[{
      'name':'visualization',
      'version':'1',
      'packages':['corechart']
    }]
  }">
</script>
</head>

<body>
<div id="chart" style="width: 1500px; height: 700px"></div>
<script>

 $GUIdriver.AllStructFieldsForNotify:{ fieldsForNotify | }; separator="$"$(document).ready(function (){

    //Device developer will specify maxDataPoints display in a chart at a time
        var maxDataPoints = 10;
        //Device developer will specify type of charts 
        var chart = new google.visualization.LineChart($GUIdriver.AllStructFieldsForNotify:{ fieldsForNotify | }; separator="$"$('#chart')[0]); 
        var data = google.visualization.arrayToDataTable([ 
        
        // Device developer will specify what kind of data to be display in chart .....(A)
            ['Time',$GUIdriver.AllStructFieldsForNotify:{fieldsForNotify|'$fieldsForNotify.name$' }; separator=","$],
            [getTime(),$GUIdriver.AllStructFieldsForNotify:{fieldsForNotify|0 }; separator=","$]
        ]); 
        var options = { 
        //Device developer will specify title and property of axis  for chart
            title: 'Temperature',
            hAxis: {title: 'Time', titleTextStyle: {color: '#333'}}, //Added label for hAxis and vAxis 
            vAxis: {title:$GUIdriver.AllStructFieldsForNotify:{fieldsForNotify|'$fieldsForNotify.name;format="capital"$'};separator="," $,  minValue: 0, titleTextStyle: {color: '#333'}},
            curveType: 'function',
            animation: {
                duration: 1000,
                easing: 'in'
            },
            legend: {position: 'bottom'}
        };
        function addDataPoint(dataPoint) { 
            if (data.getNumberOfRows() > maxDataPoints) {
                data.removeRow(0);
            }
            // Device developer will specify following value based on ref A
            data.addRow([getTime(), $GUIdriver.AllStructFieldsForNotify:{fieldsForNotify|dataPoint.$fieldsForNotify.name$};separator="," $]);
            chart.draw(data, options); 
        }
        function getTime() {
            var d = new Date();
            return d.toLocaleTimeString();
        }
        function doPoll() { 
        

           $GUIdriver.AllStructFieldsForNotify:{ fieldsForNotify | }; separator="$"$.getJSON('http://localhost:8686/temperatureData',
                           function (result) {
                        addDataPoint(result); 
                        // Device developer will specify polling time 
                        setTimeout(doPoll,5000);
                    });
        
        }
        doPoll();
    });
  </script>
  </body>
  </html>