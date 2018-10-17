package com.tungphan.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesAdapter.ViewHolder> {
    private ArrayList<Hero> mHeroes;
    private LayoutInflater mInflater;

    public HeroesAdapter(ArrayList<Hero> mHeroes, Context context) {
        this.mHeroes = mHeroes;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_hero, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.bindData(mHeroes.get(position));
    }

    @Override
    public int getItemCount() {
        return mHeroes != null ? mHeroes.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageHero;
        private TextView mTextName;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.image_hero);
            mTextName = itemView.findViewById(R.id.text_name);
        }

        public void bindData(Hero hero) {
            mImageHero.setImageResource(hero.getImageHero());
            mTextName.setText(hero.getNameHero());
        }
    }
}
