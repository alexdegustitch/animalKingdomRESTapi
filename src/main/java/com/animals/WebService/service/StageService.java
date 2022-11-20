package com.animals.WebService.service;


import com.animals.WebService.repository.StageRepository;
import com.animals.WebService.model.StageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StageService {

    @Autowired
    private StageRepository stageRepository;


    public StageModel saveStage(StageModel stageModel){
        StageModel s = stageRepository.save(stageModel);
        return s;

    }

    public List<StageModel> getStagesForTour(int id_tour){
        return stageRepository.getStagesForTour(id_tour);
    }

    public StageModel getStageByTypeForTour(Integer id_tour, Integer stage){
        return stageRepository.getStageTypeForTour(id_tour, stage);

    }

    public List<StageModel> getActiveStages(){
        return stageRepository.getActiveStages();
    }

    public StageModel getActiveStageForCompetition(int id_competition){
        return stageRepository.getActiveStageForCompetition(id_competition);
    }

    public List<StageModel> getStagesForCompetition(int id_competition){
        return stageRepository.getStagesForCompetition(id_competition);
    }


    public StageModel getStageForCompetitionByStageType(int id_competition, int stage){
        return stageRepository.getStageForCompetitionByStageType(id_competition, stage);
    }
}
