<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity" >

    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:orientation="vertical" >

	$GUIdriver.allActions:{ action | 

        <TextView
            android:id="@+id/$action.control$View"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="38dp" />

	};separator="\n"$ 

	$GUIdriver.commands:{ command |
        
        $command.widget.textboxs:{ textbox |
        	 <EditText
	            android:id="@+id/$textbox$View"
	            android:layout_width="wrap_content"
	            android:layout_height="wrap_content"
	            android:ems="10" >
        	</EditText>
        }; seperator="\n"$
        
        $command.widget.buttons:{ button |
	        <Button
			    android:id="@+id/$command.widget.button$View"
			    android:layout_width="wrap_content"
			    android:layout_height="wrap_content"
			    android:text="$command.name$"
			    android:onClick="sendMessage" />
        };separator="\n"$
    
    };separator="\n"$
        
    
    </LinearLayout>
    
    
    

</RelativeLayout>