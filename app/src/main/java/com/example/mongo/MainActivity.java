package com.example.mongo;

import androidx.appcompat.app.AppCompatActivity;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button signIn = (Button) findViewById(R.id.signIn);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    MongoClientURI uri  = new MongoClientURI("mongodb+srv://diya123:diya123@cluster0.ryi2q.mongodb.net/login?retryWrites=true&w=majority");
                    MongoClient client = new MongoClient(uri);
                    MongoDatabase db = client.getDatabase(uri.getDatabase());
//                    MongoCollection<BasicDBObject> collection = db.getCollection("users", BasicDBObject.class);
//                    NewObj newObj=new NewObj();
//                    newObj.setFirstname("jedjv");
//                    newObj.setLastname("dvhbdvhjb");
//                    newObj.setEmail("pal02.batd@gmail.com");
//                    newObj.setPassword("dlkvmdlkvn12@12");
//                    newObj.setAge(7);
//                    newObj.setWeight(78);
//                    newObj.setHeight(122);
//                    newObj.set_v(0);
//                    collection.insertOne(convert(newObj));


                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d("bvfbf","failed");
                }
            }
        });
    }
    public  static BasicDBObject convert(NewObj newObj)
    {
        return new BasicDBObject("firstname",newObj.getFirstname()).append("lastname",newObj.getLastname())
                .append("password",newObj.getPassword()).append("email",newObj.getEmail())
                .append("age",newObj.getAge()).append("weight",newObj.getWeight())
                .append("height",newObj.getHeight()).append("_v",newObj.get_v());
    }

}