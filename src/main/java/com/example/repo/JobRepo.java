package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import com.example.model.JobPost;

public class JobRepo {
	
	List<JobPost> jobs = new ArrayList<>();
	public JobRepo(){
		jobs.add(new JobPost(1,"java","java developer",4));
	}

	public void addJob(JobPost post) {
		// TODO Auto-generated method stub
		jobs.add(post);
	}

	public List<JobPost> getAllJobs() {
		// TODO Auto-generated method stub
		return jobs;
	}
	
	//method to get a job by postId
		public JobPost getJob(int postId) {
			for (JobPost job : jobs) {
				if (job.getPostId() == postId) {
					return job;
				}
			}

			return null;
		}
		
		public void updateJob(JobPost jobPost) {
			for (JobPost jobPost1 : jobs) {
				if (jobPost1.getPostId() == jobPost.getPostId()) {
					jobPost1.setPostProfile(jobPost.getPostProfile());
					jobPost1.setPostDesc(jobPost.getPostDesc());
					jobPost1.setReqExperience(jobPost.getReqExperience());
					
				}
			}

			
		}


		public void deleteJob(int postId) {
			for (JobPost jobPost : jobs) {
				if (jobPost.getPostId() == postId) {
					jobs.remove(jobPost);
					
				}
			}

		}

}
