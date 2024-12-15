use works;
-- Insert into address table
INSERT INTO `address` (`id`, `country`, `zipcode`, `number`, `city`, `street`)
VALUES
    (1, 1, '700000', '10A', 'Ho Chi Minh City', 'Le Duan'),
    (2, 1, '100000', '20B', 'Hanoi', 'Hoan Kiem'),
    (3, 1, '300000', '15C', 'Da Nang', 'Hai Chau'),
    (4, 1, '600000', '30D', 'Nha Trang', 'Tran Phu'),
    (5, 1, '400000', '25E', 'Can Tho', 'Nguyen Trai'),
    (6, 1, '200000', '35F', 'Hue', 'Le Loi'),
    (7, 1, '500000', '40G', 'Da Lat', 'Phu Dong'),
    (8, 1, '800000', '45H', 'Vung Tau', 'Ba Ria'),
    (9, 1, '900000', '50I', 'Hai Phong', 'Cat Bi'),
    (10, 1, '110000', '55J', 'Quang Ninh', 'Bai Chay');

-- Insert into roles table
INSERT INTO `roles` (`id`, `name`)
VALUES
    (1, 'Admin'),
    (2, 'Company'),
    (3, 'Candidate'),
    (4, 'HR'),
    (5, 'Manager'),
    (6, 'Employee'),
    (7, 'Intern'),
    (8, 'Supervisor'),
    (9, 'Recruiter'),
    (10, 'Support');

-- Insert into user table
INSERT INTO `user` (`user_id`, `address`, `role_id`, `email`, `password`, `phone`)
VALUES
    (1, 1, 3, 'user1@example.com', 'password1', '0901234561'),
    (2, 2, 2, 'user2@example.com', 'password2', '0901234562'),
    (3, 3, 1, 'user3@example.com', 'password3', '0901234563'),
    (4, 4, 4, 'user4@example.com', 'password4', '0901234564'),
    (5, 5, 5, 'user5@example.com', 'password5', '0901234565'),
    (6, 6, 6, 'user6@example.com', 'password6', '0901234566'),
    (7, 7, 7, 'user7@example.com', 'password7', '0901234567'),
    (8, 8, 8, 'user8@example.com', 'password8', '0901234568'),
    (9, 9, 9, 'user9@example.com', 'password9', '0901234569'),
    (10, 10, 10, 'user10@example.com', 'password10', '0901234570');

-- Insert into candidate table
INSERT INTO `candidate` (`user_id`, `dob`, `full_name`)
VALUES
    (1, '1995-01-01', 'Nguyen Van A'),
    (2, '1996-02-02', 'Tran Thi B'),
    (3, '1997-03-03', 'Le Van C'),
    (4, '1998-04-04', 'Pham Thi D'),
    (5, '1999-05-05', 'Hoang Van E'),
    (6, '2000-06-06', 'Do Thi F'),
    (7, '2001-07-07', 'Vu Van G'),
    (8, '2002-08-08', 'Ngo Thi H'),
    (9, '2003-09-09', 'Pham Van I'),
    (10, '2004-10-10', 'Bui Thi J');

-- Insert into company table
INSERT INTO `company` (`user_id`, `about`, `comp_name`, `web_url`)
VALUES
    (2, 'IT Company specializing in web development', 'Tech Co.', 'http://techco.com'),
    (4, 'Marketing Agency', 'Ad Agency', 'http://adagency.com'),
    (6, 'Software Solutions Provider', 'Soft Solutions', 'http://softsolutions.com'),
    (8, 'E-commerce Platform', 'Shopify', 'http://shopify.com'),
    (10, 'Financial Services', 'FinServ', 'http://finserv.com'),
    (3, 'Real Estate', 'RealCo', 'http://realco.com'),
    (5, 'Food & Beverage', 'Foodies', 'http://foodies.com'),
    (7, 'Healthcare Services', 'MediCare', 'http://medicare.com'),
    (9, 'Education Platform', 'EduLearn', 'http://edulearn.com'),
    (1, 'Tech Startup', 'Innovatech', 'http://innovatech.com');

-- Insert into skill table
INSERT INTO `skill` (`skill_id`, `type`, `skill_description`, `skill_name`)
VALUES
    (1, 1, 'Programming in Java', 'Java'),
    (2, 1, 'Web development with React', 'React'),
    (3, 2, 'Database Management', 'SQL'),
    (4, 1, 'Python Programming', 'Python'),
    (5, 1, 'Mobile App Development', 'Android'),
    (6, 2, 'Project Management', 'Agile'),
    (7, 3, 'Communication Skills', 'Communication'),
    (8, 3, 'Problem Solving', 'Problem Solving'),
    (9, 2, 'DevOps Practices', 'DevOps'),
    (10, 1, 'Cloud Computing', 'AWS');

-- Insert into candidate_skill table
INSERT INTO `candidate_skill` (`can_id`, `skill_id`, `skill_level`, `more_infos`)
VALUES
    (1, 1, 5, 'Experienced in building Spring Boot APIs'),
    (2, 2, 4, 'Worked on React-based projects'),
    (3, 3, 3, 'Intermediate SQL knowledge'),
    (4, 4, 5, 'Developed several Python tools'),
    (5, 5, 4, 'Built mobile applications'),
    (6, 6, 3, 'Certified in Agile methodologies'),
    (7, 7, 5, 'Excellent communication skills'),
    (8, 8, 4, 'Strong problem-solving skills'),
    (9, 9, 3, 'Basic DevOps tools knowledge'),
    (10, 10, 2, 'Familiar with AWS services');

-- Insert into job table
INSERT INTO `job` (`job_id`, `company`, `job_name`, `job_desc`, `salary`)
VALUES
    (1, 2, 'Software Engineer', 'Develop and maintain software systems.', '$2000'),
    (2, 4, 'Marketing Specialist', 'Create marketing campaigns.', '$1800'),
    (3, 6, 'Data Analyst', 'Analyze business data.', '$2200'),
    (4, 8, 'Web Developer', 'Develop web applications.', '$2100'),
    (5, 10, 'Financial Analyst', 'Perform financial forecasting.', '$2300'),
    (6, 3, 'Real Estate Agent', 'Assist clients with property transactions.', '$1900'),
    (7, 5, 'Chef', 'Prepare and cook meals.', '$1700'),
    (8, 7, 'Nurse', 'Provide patient care.', '$2500'),
    (9, 9, 'Teacher', 'Conduct online classes.', '$2400'),
    (10, 1, 'Product Manager', 'Oversee product development.', '$3000');

-- Insert into job_skill table
INSERT INTO `job_skill` (`job_id`, `skill_id`, `skill_level`, `more_infos`)
VALUES
    (1, 1, 5, 'Must have experience in Java'),
    (2, 2, 4, 'React knowledge is a must'),
    (3, 3, 4, 'Experience with SQL databases'),
    (4, 4, 5, 'Advanced Python knowledge preferred'),
    (5, 5, 3, 'Android development experience'),
    (6, 6, 4, 'Agile project management skills'),
    (7, 7, 5, 'Excellent communication needed'),
    (8, 8, 4, 'Strong problem-solving abilities'),
    (9, 9, 3, 'DevOps tools exposure required'),
    (10, 10, 2, 'AWS familiarity preferred');
