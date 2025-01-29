package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.worker.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WorkerRepository {
    Collection<Worker> workers;

    public WorkerRepository(){
        workers = new ArrayList<>();
    }

    public void add(Worker worker){
        workers.add(worker);
    }
    public boolean remove(Worker worker){
        return workers.remove(worker);
    }
    public Worker findByName(String name){
        for(Worker worker:workers){
            if(worker.getName().equals(name)){
                return worker;
            }

        }
        return null;
    }

    public Collection<Worker> getWorkers() {
        return Collections.unmodifiableCollection(workers);
    }

}
