package FundamentalsModule.Lists.Exercise;

import java.util.*;


public class CoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessons = new ArrayList<>();
        String[] initialLessons = scanner.nextLine().split(", ");
        for (String lesson : initialLessons) {
            lessons.add(lesson);
        }

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] data = input.split(":");
            String command = data[0];

            if (command.equals("Add")) {
                String title = data[1];
                if (!lessons.contains(title)) {
                    lessons.add(title);
                }
            } else if (command.equals("Insert")) {
                String title = data[1];
                int index = Integer.parseInt(data[2]);
                if (!lessons.contains(title)) {
                    if (index >= 0 && index < lessons.size()) {
                        lessons.add(index, title);
                    }
                }
            } else if (command.equals("Remove")) {
                String title = data[1];
                if (lessons.contains(title)) {
                    int index = lessons.indexOf(title);
                    if (index + 1 < lessons.size()) {
                        if (lessons.get(index + 1).equals(title + "-Exercise")) {
                            lessons.remove(index);
                            lessons.remove(index);
                        } else {
                            lessons.remove(index);
                        }
                    } else {
                        lessons.remove(index);
                    }
                }
            } else if (command.equals("Swap")) {
                String firstTitle = data[1];
                String secondTitle = data[2];
                if (lessons.contains(firstTitle) && lessons.contains(secondTitle)) {
                    int firstTitleIndex = lessons.indexOf(firstTitle);
                    int secondTitleIndex = lessons.indexOf(secondTitle);
                    lessons.set(firstTitleIndex, secondTitle);
                    lessons.set(secondTitleIndex, firstTitle);

                    if (firstTitleIndex + 1 < lessons.size() && secondTitleIndex + 1 < lessons.size()) {
                        if (lessons.get(firstTitleIndex + 1).equals(firstTitle + "-Exercise") && lessons.get(secondTitleIndex + 1).equals(secondTitle + "-Exercise")) {
                            String temp = lessons.get(secondTitleIndex + 1);
                            lessons.set(secondTitleIndex + 1, lessons.get(firstTitleIndex + 1));
                            lessons.set(firstTitleIndex + 1, temp);
                        } else if (lessons.get(firstTitleIndex + 1).equals(firstTitle + "-Exercise")) {
                            lessons.add(secondTitleIndex + 1, lessons.get(firstTitleIndex + 1));
                            if (secondTitleIndex > firstTitleIndex) {
                                lessons.remove(firstTitleIndex + 1);
                            } else if (secondTitleIndex < firstTitleIndex) {
                                lessons.remove(firstTitleIndex + 2);
                            }
                        } else if (lessons.get(secondTitleIndex + 1).equals(secondTitle + "-Exercise")) {
                            lessons.add(firstTitleIndex + 1, lessons.get(secondTitleIndex + 1));
                            if (firstTitleIndex < secondTitleIndex) {
                                lessons.remove(secondTitleIndex + 2);
                            } else if (firstTitleIndex > secondTitleIndex) {
                                lessons.remove(secondTitleIndex + 1);
                            }
                        }
                    } else if (firstTitleIndex + 1 < lessons.size()) {
                        if (lessons.get(firstTitleIndex + 1).equals(firstTitle + "-Exercise")) {
                            lessons.add(secondTitleIndex + 1, lessons.get(firstTitleIndex + 1));
                            if (secondTitleIndex > firstTitleIndex) {
                                lessons.remove(firstTitleIndex + 1);
                            } else if (secondTitleIndex < firstTitleIndex) {
                                lessons.remove(firstTitleIndex + 2);
                            }
                        }
                    } else if (secondTitleIndex + 1 < lessons.size()) {
                        if (lessons.get(secondTitleIndex + 1).equals(secondTitle + "-Exercise")) {
                            lessons.add(firstTitleIndex + 1, lessons.get(secondTitleIndex + 1));
                            if (firstTitleIndex < secondTitleIndex) {
                                lessons.remove(secondTitleIndex + 2);
                            } else if (firstTitleIndex > secondTitleIndex) {
                                lessons.remove(secondTitleIndex + 1);
                            }
                        }
                    }
                }
            } else if (command.equals("Exercise")) {
                String title = data[1];
                if (lessons.contains(title)) {
                    int index = lessons.indexOf(title);
                    if (index + 1 < lessons.size()) {
                        if (!lessons.get(index + 1).equals(title + "-Exercise")) {
                            lessons.add(index + 1, title + "-Exercise");
                        }
                    } else {
                        lessons.add(title + "-Exercise");
                    }
                } else {
                    lessons.add(title);
                    lessons.add(title + "-Exercise");
                }
            }

            input = scanner.nextLine();
        }

        for (int index = 0; index < lessons.size(); index++) {
            System.out.println((index + 1) + "." + lessons.get(index));
        }
    }
}
