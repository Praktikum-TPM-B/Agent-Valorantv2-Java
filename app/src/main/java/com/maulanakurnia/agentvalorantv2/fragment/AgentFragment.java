package com.maulanakurnia.agentvalorantv2.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.maulanakurnia.agentvalorantv2.R;
import com.maulanakurnia.agentvalorantv2.adapter.AgentAdapter;
import com.maulanakurnia.agentvalorantv2.data.AgentData;
import com.maulanakurnia.agentvalorantv2.model.AgentModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AgentFragment extends Fragment {

    @Nullable @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_agent, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Agent Valorant");

        AgentAdapter agentAdapter = new AgentAdapter(AgentData.generateAgent(),getContext());
        RecyclerView rvAgent = getView().findViewById(R.id.rv_agent_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        rvAgent.setLayoutManager(layoutManager);
        rvAgent.setHasFixedSize(true);
        rvAgent.setAdapter(agentAdapter);
    }
}
