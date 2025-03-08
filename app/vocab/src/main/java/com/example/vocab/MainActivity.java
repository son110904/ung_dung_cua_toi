package com.example.vocab;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<MyAdapter.Vocab> listVocab;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listVocab = new ArrayList<>();
        listVocab.add(new MyAdapter.Vocab("Cat", "Mèo", "[kæt]"));
        listVocab.add(new MyAdapter.Vocab("Tiger", "Hổ", "[ˈtaɪɡər]"));
        listVocab.add(new MyAdapter.Vocab("Fish", "Cá", "[fɪʃ]"));
        listVocab.add(new MyAdapter.Vocab("Bird", "Chim", "[bɜrd]"));
        listVocab.add(new MyAdapter.Vocab("Elephant", "Voi", "[ˈɛlɪfənt]"));
        listVocab.add(new MyAdapter.Vocab("Snake", "Rắn", "[sneɪk]"));
        listVocab.add(new MyAdapter.Vocab("Monkey", "Khỉ", "[ˈmʌŋki]"));
        listVocab.add(new MyAdapter.Vocab("Bear", "Gấu", "[bɛr]"));
        listVocab.add(new MyAdapter.Vocab("Cow", "Bò", "[kaʊ]"));
        listVocab.add(new MyAdapter.Vocab("Horse", "Ngựa", "[hɔrs]"));
        listVocab.add(new MyAdapter.Vocab("Duck", "Vịt", "[dʌk]"));
        listVocab.add(new MyAdapter.Vocab("Chicken", "Gà", "[ˈtʃɪkɪn]"));
        listVocab.add(new MyAdapter.Vocab("Sheep", "Cừu", "[ʃiːp]"));
        listVocab.add(new MyAdapter.Vocab("Goat", "Dê", "[ɡoʊt]"));
        listVocab.add(new MyAdapter.Vocab("Wolf", "Sói", "[wʊlf]"));
        listVocab.add(new MyAdapter.Vocab("Fox", "Cáo", "[fɑks]"));
        listVocab.add(new MyAdapter.Vocab("Rabbit", "Thỏ", "[ˈræbɪt]"));
        listVocab.add(new MyAdapter.Vocab("Frog", "Ếch", "[frɔɡ]"));
        listVocab.add(new MyAdapter.Vocab("Ant", "Kiến", "[ænt]"));
        listVocab.add(new MyAdapter.Vocab("Bee", "Ong", "[bi]"));

        // Khởi tạo Adapter và đặt Adapter cho RecyclerView
        MyAdapter adapter = new MyAdapter(this, listVocab);
        recyclerView.setAdapter(adapter);
    }
}
