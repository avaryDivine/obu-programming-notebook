import { createRequire } from 'module';
const require = createRequire(import.meta.url);

const data = require('./data.json');

// console.log(data);

export function returnJob(job_type) {
    let theType = data[job_type];
    return theType;
}
//let aJob = returnJob("AI Engineer");
//console.log(aJob);


export function returnLevelNum(job_type, exp_level) {
    let theType = data[job_type];
    let numJobs = 0;
    for (let i = 0; i < theType.length; ++i) {
        if (theType[i].experience_level === exp_level) {
            numJobs = numJobs + 1;
        }
    }
    return numJobs;
}
//let aNum = returnLevelNum("AI Engineer", "SE");
//console.log(aNum);


export function returnHighestSalary(job_type) {
    let theType = data[job_type];
    let maxSalary = 0;
    for (let i = 0; i < theType.length; ++i) {
        if (theType[i].salary_in_usd > maxSalary) {
            maxSalary = theType[i].salary_in_usd;
        }
    }
    return maxSalary;
}
//let aSalary = returnHighestSalary("AI Engineer");
//console.log(aSalary);

export function returnJobAverage(job_type) {
    let theType = data[job_type];
    let totalSalary = 0;
    for (let i = 0; i < theType.length; ++i) {
        totalSalary = totalSalary + theType[i].salary_in_usd;
    }

    let averageSalary = totalSalary / theType.length;
    return averageSalary;
    
}

export function returnAverageSalary(job_type, exp_level, emp_type) {
    let theType = data[job_type];
    let totalSalary = 0;
    if ((exp_level == null) && (emp_type == null)) {
        for (let i = 0; i < theType.length; ++i) {
            totalSalary = totalSalary + theType[i].salary_in_usd;
        }

        let averageSalary = totalSalary / theType.length;
        return averageSalary;
    }
    else if (exp_level == null) {
        let numTimes = 0;
        for (let i = 0; i < theType.length; ++i) {
            if (theType[i].employment_type === emp_type) {
                numTimes = numTimes + 1;
                totalSalary = totalSalary + theType[i].salary_in_usd;
            }
        }
        let averageSalary = totalSalary / numTimes;
        return averageSalary;
    }
    else if (emp_type == null) {
        let numTimes = 0;
        for (let i = 0; i < theType.length; ++i) {
            if (theType[i].experience_level === exp_level) {
                numTimes = numTimes + 1;
                totalSalary = totalSalary + theType[i].salary_in_usd;
            }
        }
        let averageSalary = totalSalary / numTimes;
        return averageSalary;
    }
    else {
        let numTimes = 0;
        for (let i = 0; i < theType.length; ++i) {
            if ((theType[i].experience_level === exp_level) && (theType[i].employment_type === emp_type)) {
                numTimes = numTimes + 1;
                totalSalary = totalSalary + theType[i].salary_in_usd;
            }
        }
        let averageSalary = totalSalary / numTimes;
        return averageSalary;
    }
    

}
//let aSalary = returnAverageSalary("AI Engineer");
//console.log(aSalary);

