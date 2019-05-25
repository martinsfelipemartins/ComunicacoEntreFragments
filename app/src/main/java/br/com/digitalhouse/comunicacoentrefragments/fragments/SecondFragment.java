package br.com.digitalhouse.comunicacoentrefragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import br.com.digitalhouse.comunicacoentrefragments.R;
import br.com.digitalhouse.comunicacoentrefragments.model.Person;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewProfession = view.findViewById(R.id.textViewProfession);
        TextView textViewAge = view.findViewById(R.id.textViewAge);
        Button btnSend=view.findViewById(R.id.btnSend);

        if (getArguments() != null) {
            Person person = getArguments().getParcelable("PERSON");

            if (person != null) {
                textViewName.setText(person.getNome());
                textViewProfession.setText(person.getProfession());
                textViewProfession.setText(person.getAge() + " anos");
            }

        }

        return view;
    }

}
