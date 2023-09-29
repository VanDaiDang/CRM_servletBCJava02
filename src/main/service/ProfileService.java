package main.service;

import main.entity.Job;

import java.util.List;

public class ProfileService {
    private ProfileRepository profileRepository = new ProfileRepository();

    public List<Job> showListJob(){
        return profileRepository.showListJob();
    }


}
