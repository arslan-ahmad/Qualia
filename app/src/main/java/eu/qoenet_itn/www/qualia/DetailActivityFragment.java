package eu.qoenet_itn.www.qualia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
//        Button UserProfileBtn = (Button) rootView.findViewById(R.id.userprofilebutton);
//        Button ContextBtn = (Button) rootView.findViewById(R.id.contextbutton);
//        Button ResourceBtn = (Button) rootView.findViewById(R.id.resourcebutton);
//        Button ApplicationBtn = (Button) rootView.findViewById(R.id.applicationbutton);
//        Button NetworkBtn = (Button) rootView.findViewById(R.id.networkbutton);
//        UserProfileBtn.setOnClickListener((View.OnClickListener) this);
//        ContextBtn.setOnClickListener((View.OnClickListener) this);
//        ResourceBtn.setOnClickListener((View.OnClickListener) this);
//        ApplicationBtn.setOnClickListener((View.OnClickListener) this);
//        NetworkBtn.setOnClickListener((View.OnClickListener) this);

        return rootView;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        // get the button view
        Button UserProfileBtn = (Button) getView().findViewById(R.id.userprofilebutton);
        Button ContextBtn = (Button) getView().findViewById(R.id.contextbutton);
        Button ResourceBtn = (Button) getView().findViewById(R.id.resourcebutton);
        Button ApplicationBtn = (Button) getView().findViewById(R.id.applicationbutton);
        Button NetworkBtn = (Button) getView().findViewById(R.id.networkbutton);
        // set a onclick listener for when the button gets clicked
        UserProfileBtn.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        DetailActivity.class);
                startActivity(mainIntent);
            }
        });
        // set a onclick listener for when the button gets clicked
        ContextBtn.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        DetailActivity.class);
                startActivity(mainIntent);
            }
        });
        // set a onclick listener for when the button gets clicked
        ResourceBtn.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        DetailActivity.class);
                startActivity(mainIntent);
            }
        });
        // set a onclick listener for when the button gets clicked
        ApplicationBtn.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        DetailActivity.class);
                startActivity(mainIntent);
            }
        });
        // set a onclick listener for when the button gets clicked
        NetworkBtn.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        NwProbe.class);
                startActivity(mainIntent);
            }
        });
    }
}
