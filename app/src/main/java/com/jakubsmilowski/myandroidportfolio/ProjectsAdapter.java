package com.jakubsmilowski.myandroidportfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjecViewHolder> {

    //Give it a class field that we are adapting - want to show
    private Project[] projects;
    //Seting a constructor fo this class.
    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    //Geting count of our projects
    @Override
    public int getItemCount() {
        return projects.length;
    }
    //Manualy crate layout inflator - wich is a code that builds the layout file so it is visible on the screen
    @NonNull
    @Override
    public ProjecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //This line makes it possible to display our code on the screen, dont need to memorize, need to remember it is called Inflating view holder?
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjecViewHolder(view);
    }
    //For each item this method is called, and it iterates for each project view holder, and it gives it individual project.
    @Override
    public void onBindViewHolder(@NonNull ProjecViewHolder holder, int position) {
        holder.bind(projects[position]);
    }

    // Here we set actualy layout of our
    static class ProjecViewHolder extends RecyclerView.ViewHolder {

        private ImageView appImage;
        private TextView appTitle;
        private TextView appDescription;

        //Here we find view by id, but its not as in main becouse we are in item view.
        public ProjecViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project_icon);
            appTitle = itemView.findViewById(R.id.text_view_project_title);
            appDescription = itemView.findViewById(R.id.text_view_project_description);
        }
        //Then we assign each value to our project components
        public void bind(Project project) {
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }


    }

}
