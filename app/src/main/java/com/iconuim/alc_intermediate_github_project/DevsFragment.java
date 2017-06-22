package com.iconuim.alc_intermediate_github_project;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.iconuim.alc_intermediate_github_project.dummy.DummyContent;

import java.util.ArrayList;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Large screen devices (such as tablets) are supported by replacing the ListView
 * with a GridView.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnFragmentInteractionListener}
 * interface.
 */
public class DevsFragment extends ListFragment implements AbsListView.OnItemClickListener {

    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static  ArrayAdapter<GitDev> adapter;
    private static ListAdapter mAdapter;
    private static ArrayList<GitDev> usersList = new ArrayList<>();
    private OnFragmentInteractionListener mListener;




    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public DevsFragment() {
    }

    // TODO: Rename and change types of parameters
    public static DevsFragment newInstance(String param1, String param2) {
        DevsFragment fragment = new DevsFragment();
        Bundle args = new Bundle();
    //    args.putString(ARG_PARAM1, param1);
     //   args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public void getUserInfo()
    {

        String gitAPIUrl = getString(R.string.githubUserAPI);

        //volley request

       /* RequestQueue mRequestQueue;

// Instantiate the cache
        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap

// Set up the network to use HttpURLConnection as the HTTP client.
        Network network = new BasicNetwork(new HurlStack());

// Instantiate the RequestQueue with the cache and network.
        mRequestQueue = new RequestQueue(cache, network);

// Start the queue
        mRequestQueue.start();

        String url ="http://www.example.com";

// Formulate the request and handle the response.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Do something with the response
                        // run another volley request
                        //then send its response to add user;

                        //addUsers();


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Handle error
                    }
                });

// Add the request to the RequestQueue.
        mRequestQueue.add(stringRequest);

*/

    }

    public void addUsers(GitDev dev)
    {

        adapter.add(dev);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

         //   mParam2 = getArguments().getString(ARG_PARAM2);
        }

        // TODO: Change Adapter to display your content
        mAdapter = new ArrayAdapter<DummyContent.DummyItem>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, DummyContent.ITEMS);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_devs, container, false);



        // Set the adapter
       // mListView = (AbsListView) view.findViewById(android.R.id.list);
       // ((AdapterView<ListAdapter>) mListView).setAdapter(mAdapter);

        // Set OnItemClickListener so we can be notified on item clicks
      //  mListView.setOnItemClickListener(this);

        return view;
    }

  /*  @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

      */
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (null != mListener) {
            // Notify the active callbacks interface (the activity, if the
            // fragment is attached to one) that an item has been selected.
            mListener.onFragmentInteraction(DummyContent.ITEMS.get(position).id);
        }
    }

    /**
     * The default content for this Fragment has a TextView that is shown when
     * the list is empty. If you would like to change the text, call this method
     * to supply the text it should use.
     */
    public void setEmptyText(CharSequence emptyText) {


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        adapter = new ArrayAdapter<GitDev>(getContext(),android.R.layout.simple_list_item_1,usersList);
        setListAdapter(adapter);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(String id);
    }
}
